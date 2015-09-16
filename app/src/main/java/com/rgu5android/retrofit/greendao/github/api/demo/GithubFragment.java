package com.rgu5android.retrofit.greendao.github.api.demo;

import android.app.ProgressDialog;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.rgu5android.retrofit.greendao.github.api.demo.greenDAO.DaoMaster;
import com.rgu5android.retrofit.greendao.github.api.demo.greenDAO.DaoSession;
import com.rgu5android.retrofit.greendao.github.api.demo.greenDAO.GithubGD;
import com.rgu5android.retrofit.greendao.github.api.demo.greenDAO.GithubGDDao;
import com.rgu5android.retrofit.greendao.github.api.demo.retrofit.GithubModel;
import com.rgu5android.retrofit.greendao.github.api.demo.retrofit.IGithubInterface;

import java.util.List;

import retrofit.Callback;
import retrofit.RestAdapter;
import retrofit.RetrofitError;
import retrofit.client.Response;

public class GithubFragment extends Fragment implements View.OnClickListener, Callback<GithubModel> {

    private static final String URL = "https://api.github.com";
    private ProgressDialog mProgressDialog;

    public GithubFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_github, container, false);
        Button performActionButton = (Button) view.findViewById(R.id.button_perform_action);
        performActionButton.setOnClickListener(this);
        return view;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mProgressDialog = new ProgressDialog(getActivity());
        mProgressDialog.setCancelable(false);
        mProgressDialog.setTitle("Processing Data");
    }

    @Override
    public void onClick(View v) {
        mProgressDialog.setMessage("Fetching Data From Server");
        mProgressDialog.show();
        RestAdapter restAdapter = new RestAdapter.Builder().setEndpoint(URL).
                setLogLevel(RestAdapter.LogLevel.FULL).build();
        IGithubInterface iGithubInterface = restAdapter.create(IGithubInterface.class);
        iGithubInterface.getFeed("RGU5Android", this);
    }

    private void insertDataIntoDatabase(final GithubModel githubModel) {
        DaoMaster.DevOpenHelper devOpenHelper = new DaoMaster.DevOpenHelper(getActivity(), "github-db", null);
        SQLiteDatabase sqLiteDatabase = devOpenHelper.getWritableDatabase();

        DaoMaster daoMaster = new DaoMaster(sqLiteDatabase);
        DaoSession daoSession = daoMaster.newSession();

        GithubGDDao githubGDDao = daoSession.getGithubGDDao();
        List<GithubGD> githubGDs =
                githubGDDao.queryBuilder().where(GithubGDDao.Properties.Email.eq("RGU5Android@gmail.com"))
                        .orderAsc(GithubGDDao.Properties.Id).list();

        Log.wtf("Select Query Output:", githubGDs.toString());

        githubGDDao.deleteAll();

        for (int i = 0; i < 10; i++) {
            GithubGD githubGD = new GithubGD(githubModel.getId() + i, githubModel.getLogin(),
                    githubModel.getAvatarUrl(), githubModel.getGravatarId(),
                    githubModel.getUrl(), githubModel.getHtmlUrl(), githubModel.getFollowersUrl(),
                    githubModel.getFollowingUrl(), githubModel.getGistsUrl(), githubModel.getStarredUrl(), githubModel.getSubscriptionsUrl(),
                    githubModel.getOrganizationsUrl(), githubModel.getReposUrl(), githubModel.getEventsUrl(), githubModel.getReceivedEventsUrl(),
                    githubModel.getType(), githubModel.getName(), githubModel.getLocation(), githubModel.getEmail(), githubModel.getCreatedAt(),
                    githubModel.getUpdatedAt(), githubModel.isHireable(), githubModel.getPublicRepos(), githubModel.getPublicGists(),
                    githubModel.getFollowers(), githubModel.getFollowing());

            //  githubGDDao.insert(githubGD); Insert method throws error if id exists.

            githubGDDao.insertOrReplace(githubGD);
            Log.wtf("Inserted", "" + i);
        }

        githubGDDao.delete(new GithubGD(githubModel.getId() + 5, githubModel.getLogin(),
                githubModel.getAvatarUrl(), githubModel.getGravatarId(),
                githubModel.getUrl(), githubModel.getHtmlUrl(), githubModel.getFollowersUrl(),
                githubModel.getFollowingUrl(), githubModel.getGistsUrl(), githubModel.getStarredUrl(), githubModel.getSubscriptionsUrl(),
                githubModel.getOrganizationsUrl(), githubModel.getReposUrl(), githubModel.getEventsUrl(), githubModel.getReceivedEventsUrl(),
                githubModel.getType(), githubModel.getName(), githubModel.getLocation(), githubModel.getEmail(), githubModel.getCreatedAt(),
                githubModel.getUpdatedAt(), githubModel.isHireable(), githubModel.getPublicRepos(), githubModel.getPublicGists(),
                githubModel.getFollowers(), githubModel.getFollowing()));

        Log.wtf("DB", githubGDDao.loadAll().toString());

        mProgressDialog.dismiss();

    }

    @Override
    public void success(GithubModel githubModel, Response response) {
        insertDataIntoDatabase(githubModel);
    }

    @Override
    public void failure(RetrofitError error) {
        Log.wtf("Error", error.getCause());
    }
}


















