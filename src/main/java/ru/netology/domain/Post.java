package ru.netology.domain;

public class Post {
    private int id;
    private int ownerId;
    private int fromId;
    private int createdBy;
    private int date;
    private String text;
    private int replyOwnerId;
    private int replyPostId;
    private boolean friendsOnly;

    private CommentsInfo commentsInfo;
    private CopyRightInfo copyRightInfo;
    private LikesInfo likesInfo;
    private RepostInfo repostInfo;
    private ViewsInfo viewsInfo;

    private String postType;

    private PostSourceInfo postSourceInfo;
    private GeoInfo geoInfo;

    private int signerId;
    private boolean canPin;
    private boolean canDelete;
    private boolean canEdit;
    private boolean isPinned;
    private boolean markedAsAds;
    private boolean isFavorite;

    private DonutInfo donutInfo;

    private int postponedId;

// + get/set на все поля


}