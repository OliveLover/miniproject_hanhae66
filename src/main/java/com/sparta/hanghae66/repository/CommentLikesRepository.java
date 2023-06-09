package com.sparta.hanghae66.repository;

import com.sparta.hanghae66.entity.CommentLikes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CommentLikesRepository extends JpaRepository<CommentLikes, Long> {
    Optional<CommentLikes> findByCmtLikesUserIdAndCmtLikesId(String comLikesUserId, Long cmtLikesId);

    @Query("SELECT count(c) FROM TB_CMTLIKES c WHERE c.cmtLikesId = :commentId AND c.cmtLikes = true")
    Long getCmtLikesCount(@Param("commentId") Long commentId);

    @Query("SELECT c FROM TB_CMTLIKES c WHERE c.cmtLikesId = :commentId and c.cmtLikesUserId = :userId")
    CommentLikes findByUserId(@Param("commentId") Long commentId, @Param("userId") String userId);

    @Query("SELECT c FROM TB_CMTLIKES c WHERE c.cmtLikesId = :commentId and c.cmtLikesUserId = :userId")
    Optional<CommentLikes> findByUserId_Opt(@Param("commentId") Long commentId, @Param("userId") String userId);
}
