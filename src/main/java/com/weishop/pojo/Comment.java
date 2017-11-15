package com.weishop.pojo;

import java.io.Serializable;

import com.baomidou.mybatisplus.enums.IdType;
import com.weishop.pojo.enums.CommentBusType;
import com.weishop.pojo.enums.CommentType;

import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.annotations.TableLogic;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author HeShaowei
 * @since 2017-11-15
 */
@TableName("bus_comment")
public class Comment extends Model<Comment> {

    private static final long serialVersionUID = 1L;

	@TableId(value="id", type= IdType.AUTO)
	private Integer id;
    /**
     * 回复的评论ID
     */
	@TableField("p_id")
	private Integer pId;
    /**
     * 评论关联ID
     */
	@TableField("bus_id")
	private Integer busId;
    /**
     * 评论关联类型
     */
	@TableField("comment_bus_type")
	private Integer commentBusType;
    /**
     * 评论人
     */
	@TableField("user_id")
	private Integer userId;
    /**
     * 评论人
     */
	@TableField("user_name")
	private String userName;
    /**
     * 评价类型，1：主评价，2：追加评价，3：商家回复
     */
	@TableField("comment_type")
	private String commentType;
    /**
     * 评论内容
     */
	private String comment;
    /**
     * 5星评分
     */
	private Integer stars;
	@TableField("delete_flag")
    @TableLogic
	private String deleteFlag;
	@TableField("create_time")
	private Date createTime;
	@TableField("create_by")
	private String createBy;
	@TableField("modify_time")
	private Date modifyTime;
	@TableField("modify_by")
	private String modifyBy;


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getpId() {
		return pId;
	}

	public void setpId(Integer pId) {
		this.pId = pId;
	}

	public Integer getBusId() {
		return busId;
	}

	public void setBusId(Integer busId) {
		this.busId = busId;
	}

	public Integer getCommentBusType() {
		return commentBusType;
	}

	public void setCommentBusType(Integer commentBusType) {
		this.commentBusType = commentBusType;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getCommentType() {
		return commentType;
	}

	public void setCommentType(String commentType) {
		this.commentType = commentType;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public Integer getStars() {
		return stars;
	}

	public void setStars(Integer stars) {
		this.stars = stars;
	}

	public String getDeleteFlag() {
		return deleteFlag;
	}

	public void setDeleteFlag(String deleteFlag) {
		this.deleteFlag = deleteFlag;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getCreateBy() {
		return createBy;
	}

	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}

	public Date getModifyTime() {
		return modifyTime;
	}

	public void setModifyTime(Date modifyTime) {
		this.modifyTime = modifyTime;
	}

	public String getModifyBy() {
		return modifyBy;
	}

	public void setModifyBy(String modifyBy) {
		this.modifyBy = modifyBy;
	}

	public static final String ID = "id";

	public static final String P_ID = "p_id";

	public static final String BUS_ID = "bus_id";

	public static final String COMMENT_BUS_TYPE = "comment_bus_type";

	public static final String USER_ID = "user_id";

	public static final String USER_NAME = "user_name";

	public static final String COMMENT_TYPE = "comment_type";

	public static final String COMMENT = "comment";

	public static final String STARS = "stars";

	public static final String DELETE_FLAG = "delete_flag";

	public static final String CREATE_TIME = "create_time";

	public static final String CREATE_BY = "create_by";

	public static final String MODIFY_TIME = "modify_time";

	public static final String MODIFY_BY = "modify_by";

	@Override
	protected Serializable pkVal() {
		return this.id;
	}

	@Override
	public String toString() {
		return "Comment{" +
			"id=" + id +
			", pId=" + pId +
			", busId=" + busId +
			", commentBusType=" + commentBusType +
			", userId=" + userId +
			", userName=" + userName +
			", commentType=" + commentType +
			", comment=" + comment +
			", stars=" + stars +
			", deleteFlag=" + deleteFlag +
			", createTime=" + createTime +
			", createBy=" + createBy +
			", modifyTime=" + modifyTime +
			", modifyBy=" + modifyBy +
			"}";
	}
}
