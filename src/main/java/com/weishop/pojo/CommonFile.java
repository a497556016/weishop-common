package com.weishop.pojo;

import java.io.Serializable;

import com.baomidou.mybatisplus.enums.IdType;
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
 * @since 2017-10-27
 */
@TableName("base_common_file")
public class CommonFile extends Model<CommonFile> {

    private static final long serialVersionUID = 1L;

	@TableId(value="id", type= IdType.AUTO)
	private Integer id;
    /**
     * 业务ID
     */
	@TableField("bus_id")
	private Integer busId;
    /**
     * 业务类型
     */
	@TableField("bus_type")
	private String busType;
    /**
     * 文件类型，0：其他、1：图片、2：word、3：excel、4：压缩包
     */
	@TableField("file_type")
	private String fileType;
    /**
     * 文件名称
     */
	@TableField("file_name")
	private String fileName;
    /**
     * 文件服务器存储路径
     */
	@TableField("file_path")
	private String filePath;
    /**
     * 水印文件存储路径
     */
	@TableField("file_water_path")
	private String fileWaterPath;
    /**
     * 缩略图存储路径
     */
	@TableField("file_thumb_path")
	private String fileThumbPath;
	private String enabled;
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

	public Integer getBusId() {
		return busId;
	}

	public void setBusId(Integer busId) {
		this.busId = busId;
	}

	public String getBusType() {
		return busType;
	}

	public void setBusType(String busType) {
		this.busType = busType;
	}

	public String getFileType() {
		return fileType;
	}

	public void setFileType(String fileType) {
		this.fileType = fileType;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getFilePath() {
		return filePath;
	}

	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}

	public String getFileWaterPath() {
		return fileWaterPath;
	}

	public void setFileWaterPath(String fileWaterPath) {
		this.fileWaterPath = fileWaterPath;
	}

	public String getFileThumbPath() {
		return fileThumbPath;
	}

	public void setFileThumbPath(String fileThumbPath) {
		this.fileThumbPath = fileThumbPath;
	}

	public String getEnabled() {
		return enabled;
	}

	public void setEnabled(String enabled) {
		this.enabled = enabled;
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

	public static final String BUS_ID = "bus_id";

	public static final String BUS_TYPE = "bus_type";

	public static final String FILE_TYPE = "file_type";

	public static final String FILE_NAME = "file_name";

	public static final String FILE_PATH = "file_path";

	public static final String FILE_WATER_PATH = "file_water_path";

	public static final String FILE_THUMB_PATH = "file_thumb_path";

	public static final String ENABLED = "enabled";

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
		return "CommonFile{" +
			"id=" + id +
			", busId=" + busId +
			", busType=" + busType +
			", fileType=" + fileType +
			", fileName=" + fileName +
			", filePath=" + filePath +
			", fileWaterPath=" + fileWaterPath +
			", fileThumbPath=" + fileThumbPath +
			", enabled=" + enabled +
			", deleteFlag=" + deleteFlag +
			", createTime=" + createTime +
			", createBy=" + createBy +
			", modifyTime=" + modifyTime +
			", modifyBy=" + modifyBy +
			"}";
	}
}
