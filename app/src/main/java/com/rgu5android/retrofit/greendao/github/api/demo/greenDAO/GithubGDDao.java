package com.rgu5android.retrofit.greendao.github.api.demo.greenDAO;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.internal.DaoConfig;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "GITHUB_GD".
*/
public class GithubGDDao extends AbstractDao<GithubGD, Long> {

    public static final String TABLENAME = "GITHUB_GD";

    /**
     * Properties of entity GithubGD.<br/>
     * Can be used for QueryBuilder and for referencing column names.
    */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property Login = new Property(1, String.class, "login", false, "LOGIN");
        public final static Property AvatarUrl = new Property(2, String.class, "avatarUrl", false, "AVATAR_URL");
        public final static Property GravatarId = new Property(3, String.class, "gravatarId", false, "GRAVATAR_ID");
        public final static Property Url = new Property(4, String.class, "url", false, "URL");
        public final static Property HtmlUrl = new Property(5, String.class, "htmlUrl", false, "HTML_URL");
        public final static Property FollowersUrl = new Property(6, String.class, "followersUrl", false, "FOLLOWERS_URL");
        public final static Property FollowingUrl = new Property(7, String.class, "followingUrl", false, "FOLLOWING_URL");
        public final static Property GistsUrl = new Property(8, String.class, "gistsUrl", false, "GISTS_URL");
        public final static Property StarredUrl = new Property(9, String.class, "starredUrl", false, "STARRED_URL");
        public final static Property SubscriptionsUrl = new Property(10, String.class, "subscriptionsUrl", false, "SUBSCRIPTIONS_URL");
        public final static Property OrganizationsUrl = new Property(11, String.class, "organizationsUrl", false, "ORGANIZATIONS_URL");
        public final static Property ReposUrl = new Property(12, String.class, "reposUrl", false, "REPOS_URL");
        public final static Property EventsUrl = new Property(13, String.class, "eventsUrl", false, "EVENTS_URL");
        public final static Property ReceivedEventsUrl = new Property(14, String.class, "receivedEventsUrl", false, "RECEIVED_EVENTS_URL");
        public final static Property Type = new Property(15, String.class, "type", false, "TYPE");
        public final static Property Name = new Property(16, String.class, "name", false, "NAME");
        public final static Property Location = new Property(17, String.class, "location", false, "LOCATION");
        public final static Property Email = new Property(18, String.class, "email", false, "EMAIL");
        public final static Property CreatedAt = new Property(19, String.class, "createdAt", false, "CREATED_AT");
        public final static Property UpdatedAt = new Property(20, String.class, "updatedAt", false, "UPDATED_AT");
        public final static Property Hireable = new Property(21, Boolean.class, "hireable", false, "HIREABLE");
        public final static Property PublicRepos = new Property(22, Long.class, "publicRepos", false, "PUBLIC_REPOS");
        public final static Property PublicGists = new Property(23, Long.class, "publicGists", false, "PUBLIC_GISTS");
        public final static Property Followers = new Property(24, Long.class, "followers", false, "FOLLOWERS");
        public final static Property Following = new Property(25, Long.class, "following", false, "FOLLOWING");
    };


    public GithubGDDao(DaoConfig config) {
        super(config);
    }
    
    public GithubGDDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(SQLiteDatabase db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"GITHUB_GD\" (" + //
                "\"_id\" INTEGER PRIMARY KEY ," + // 0: id
                "\"LOGIN\" TEXT," + // 1: login
                "\"AVATAR_URL\" TEXT," + // 2: avatarUrl
                "\"GRAVATAR_ID\" TEXT," + // 3: gravatarId
                "\"URL\" TEXT," + // 4: url
                "\"HTML_URL\" TEXT," + // 5: htmlUrl
                "\"FOLLOWERS_URL\" TEXT," + // 6: followersUrl
                "\"FOLLOWING_URL\" TEXT," + // 7: followingUrl
                "\"GISTS_URL\" TEXT," + // 8: gistsUrl
                "\"STARRED_URL\" TEXT," + // 9: starredUrl
                "\"SUBSCRIPTIONS_URL\" TEXT," + // 10: subscriptionsUrl
                "\"ORGANIZATIONS_URL\" TEXT," + // 11: organizationsUrl
                "\"REPOS_URL\" TEXT," + // 12: reposUrl
                "\"EVENTS_URL\" TEXT," + // 13: eventsUrl
                "\"RECEIVED_EVENTS_URL\" TEXT," + // 14: receivedEventsUrl
                "\"TYPE\" TEXT," + // 15: type
                "\"NAME\" TEXT," + // 16: name
                "\"LOCATION\" TEXT," + // 17: location
                "\"EMAIL\" TEXT," + // 18: email
                "\"CREATED_AT\" TEXT," + // 19: createdAt
                "\"UPDATED_AT\" TEXT," + // 20: updatedAt
                "\"HIREABLE\" INTEGER," + // 21: hireable
                "\"PUBLIC_REPOS\" INTEGER," + // 22: publicRepos
                "\"PUBLIC_GISTS\" INTEGER," + // 23: publicGists
                "\"FOLLOWERS\" INTEGER," + // 24: followers
                "\"FOLLOWING\" INTEGER);"); // 25: following
    }

    /** Drops the underlying database table. */
    public static void dropTable(SQLiteDatabase db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"GITHUB_GD\"";
        db.execSQL(sql);
    }

    /** @inheritdoc */
    @Override
    protected void bindValues(SQLiteStatement stmt, GithubGD entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        String login = entity.getLogin();
        if (login != null) {
            stmt.bindString(2, login);
        }
 
        String avatarUrl = entity.getAvatarUrl();
        if (avatarUrl != null) {
            stmt.bindString(3, avatarUrl);
        }
 
        String gravatarId = entity.getGravatarId();
        if (gravatarId != null) {
            stmt.bindString(4, gravatarId);
        }
 
        String url = entity.getUrl();
        if (url != null) {
            stmt.bindString(5, url);
        }
 
        String htmlUrl = entity.getHtmlUrl();
        if (htmlUrl != null) {
            stmt.bindString(6, htmlUrl);
        }
 
        String followersUrl = entity.getFollowersUrl();
        if (followersUrl != null) {
            stmt.bindString(7, followersUrl);
        }
 
        String followingUrl = entity.getFollowingUrl();
        if (followingUrl != null) {
            stmt.bindString(8, followingUrl);
        }
 
        String gistsUrl = entity.getGistsUrl();
        if (gistsUrl != null) {
            stmt.bindString(9, gistsUrl);
        }
 
        String starredUrl = entity.getStarredUrl();
        if (starredUrl != null) {
            stmt.bindString(10, starredUrl);
        }
 
        String subscriptionsUrl = entity.getSubscriptionsUrl();
        if (subscriptionsUrl != null) {
            stmt.bindString(11, subscriptionsUrl);
        }
 
        String organizationsUrl = entity.getOrganizationsUrl();
        if (organizationsUrl != null) {
            stmt.bindString(12, organizationsUrl);
        }
 
        String reposUrl = entity.getReposUrl();
        if (reposUrl != null) {
            stmt.bindString(13, reposUrl);
        }
 
        String eventsUrl = entity.getEventsUrl();
        if (eventsUrl != null) {
            stmt.bindString(14, eventsUrl);
        }
 
        String receivedEventsUrl = entity.getReceivedEventsUrl();
        if (receivedEventsUrl != null) {
            stmt.bindString(15, receivedEventsUrl);
        }
 
        String type = entity.getType();
        if (type != null) {
            stmt.bindString(16, type);
        }
 
        String name = entity.getName();
        if (name != null) {
            stmt.bindString(17, name);
        }
 
        String location = entity.getLocation();
        if (location != null) {
            stmt.bindString(18, location);
        }
 
        String email = entity.getEmail();
        if (email != null) {
            stmt.bindString(19, email);
        }
 
        String createdAt = entity.getCreatedAt();
        if (createdAt != null) {
            stmt.bindString(20, createdAt);
        }
 
        String updatedAt = entity.getUpdatedAt();
        if (updatedAt != null) {
            stmt.bindString(21, updatedAt);
        }
 
        Boolean hireable = entity.getHireable();
        if (hireable != null) {
            stmt.bindLong(22, hireable ? 1L: 0L);
        }
 
        Long publicRepos = entity.getPublicRepos();
        if (publicRepos != null) {
            stmt.bindLong(23, publicRepos);
        }
 
        Long publicGists = entity.getPublicGists();
        if (publicGists != null) {
            stmt.bindLong(24, publicGists);
        }
 
        Long followers = entity.getFollowers();
        if (followers != null) {
            stmt.bindLong(25, followers);
        }
 
        Long following = entity.getFollowing();
        if (following != null) {
            stmt.bindLong(26, following);
        }
    }

    /** @inheritdoc */
    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    /** @inheritdoc */
    @Override
    public GithubGD readEntity(Cursor cursor, int offset) {
        GithubGD entity = new GithubGD( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // login
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // avatarUrl
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // gravatarId
            cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4), // url
            cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5), // htmlUrl
            cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6), // followersUrl
            cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7), // followingUrl
            cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8), // gistsUrl
            cursor.isNull(offset + 9) ? null : cursor.getString(offset + 9), // starredUrl
            cursor.isNull(offset + 10) ? null : cursor.getString(offset + 10), // subscriptionsUrl
            cursor.isNull(offset + 11) ? null : cursor.getString(offset + 11), // organizationsUrl
            cursor.isNull(offset + 12) ? null : cursor.getString(offset + 12), // reposUrl
            cursor.isNull(offset + 13) ? null : cursor.getString(offset + 13), // eventsUrl
            cursor.isNull(offset + 14) ? null : cursor.getString(offset + 14), // receivedEventsUrl
            cursor.isNull(offset + 15) ? null : cursor.getString(offset + 15), // type
            cursor.isNull(offset + 16) ? null : cursor.getString(offset + 16), // name
            cursor.isNull(offset + 17) ? null : cursor.getString(offset + 17), // location
            cursor.isNull(offset + 18) ? null : cursor.getString(offset + 18), // email
            cursor.isNull(offset + 19) ? null : cursor.getString(offset + 19), // createdAt
            cursor.isNull(offset + 20) ? null : cursor.getString(offset + 20), // updatedAt
            cursor.isNull(offset + 21) ? null : cursor.getShort(offset + 21) != 0, // hireable
            cursor.isNull(offset + 22) ? null : cursor.getLong(offset + 22), // publicRepos
            cursor.isNull(offset + 23) ? null : cursor.getLong(offset + 23), // publicGists
            cursor.isNull(offset + 24) ? null : cursor.getLong(offset + 24), // followers
            cursor.isNull(offset + 25) ? null : cursor.getLong(offset + 25) // following
        );
        return entity;
    }
     
    /** @inheritdoc */
    @Override
    public void readEntity(Cursor cursor, GithubGD entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setLogin(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setAvatarUrl(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setGravatarId(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setUrl(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
        entity.setHtmlUrl(cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5));
        entity.setFollowersUrl(cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6));
        entity.setFollowingUrl(cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7));
        entity.setGistsUrl(cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8));
        entity.setStarredUrl(cursor.isNull(offset + 9) ? null : cursor.getString(offset + 9));
        entity.setSubscriptionsUrl(cursor.isNull(offset + 10) ? null : cursor.getString(offset + 10));
        entity.setOrganizationsUrl(cursor.isNull(offset + 11) ? null : cursor.getString(offset + 11));
        entity.setReposUrl(cursor.isNull(offset + 12) ? null : cursor.getString(offset + 12));
        entity.setEventsUrl(cursor.isNull(offset + 13) ? null : cursor.getString(offset + 13));
        entity.setReceivedEventsUrl(cursor.isNull(offset + 14) ? null : cursor.getString(offset + 14));
        entity.setType(cursor.isNull(offset + 15) ? null : cursor.getString(offset + 15));
        entity.setName(cursor.isNull(offset + 16) ? null : cursor.getString(offset + 16));
        entity.setLocation(cursor.isNull(offset + 17) ? null : cursor.getString(offset + 17));
        entity.setEmail(cursor.isNull(offset + 18) ? null : cursor.getString(offset + 18));
        entity.setCreatedAt(cursor.isNull(offset + 19) ? null : cursor.getString(offset + 19));
        entity.setUpdatedAt(cursor.isNull(offset + 20) ? null : cursor.getString(offset + 20));
        entity.setHireable(cursor.isNull(offset + 21) ? null : cursor.getShort(offset + 21) != 0);
        entity.setPublicRepos(cursor.isNull(offset + 22) ? null : cursor.getLong(offset + 22));
        entity.setPublicGists(cursor.isNull(offset + 23) ? null : cursor.getLong(offset + 23));
        entity.setFollowers(cursor.isNull(offset + 24) ? null : cursor.getLong(offset + 24));
        entity.setFollowing(cursor.isNull(offset + 25) ? null : cursor.getLong(offset + 25));
     }
    
    /** @inheritdoc */
    @Override
    protected Long updateKeyAfterInsert(GithubGD entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    /** @inheritdoc */
    @Override
    public Long getKey(GithubGD entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    /** @inheritdoc */
    @Override    
    protected boolean isEntityUpdateable() {
        return true;
    }
    
}