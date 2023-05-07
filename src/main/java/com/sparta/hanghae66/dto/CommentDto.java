package com.sparta.hanghae66.dto;

import com.sparta.hanghae66.entity.Comment;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class CommentDto {

    private Long cmtId;

    private String cmtContent;

    private Long cmtLikes;

    private String cmtUserId;

    private String cmtUserName;

    public CommentDto(Comment comment) {
        this.cmtId = comment.getCmtId();
        this.cmtContent = comment.getCmtContent();
        this.cmtLikes = comment.getCmtLikes();
        this.cmtUserId = comment.getCmtUserId();
        this.cmtUserName = comment.getCmtUserName();
    }
}
