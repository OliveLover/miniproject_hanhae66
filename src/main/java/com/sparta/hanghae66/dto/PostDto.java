package com.sparta.hanghae66.dto;

import com.sparta.hanghae66.entity.Post;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@NoArgsConstructor
@Getter
@Setter
public class PostDto {
    private Long postId;
    private String postTitle;
    private String postContent;
    private String postSkill;
    private String postFile;
    private Long postLikes;
    private String postUserId;
    private String postUserName;
    private Long postVisitCnt;

    private String userSkill;
    private Long userYear;

    private Long cmtCount;
    private List<CommentDto> commentList;

    private LocalDateTime createdAt;
    private LocalDateTime modifiedAt;

    private Boolean chkpostLikes;

    public PostDto(Post post) {
        this.postId = post.getPostId();
        this.postTitle = post.getPostTitle();
        this.postContent = post.getPostContent();
        this.postSkill = post.getPostSkill();
        this.userSkill = post.getUserSkill();
        this.userYear = post.getUserYear();
        this.postFile = post.getPostFile();
        this.postLikes = post.getPostLikes();
        this.postUserId = post.getPostUserId();
        this.postUserName = post.getPostUserName();
        this.postVisitCnt = post.getPostVisitCnt();
        this.cmtCount = post.getCmtCount();
        this.createdAt = post.getCreatedAt();
        this.modifiedAt = post.getModifiedAt();
    }
}
