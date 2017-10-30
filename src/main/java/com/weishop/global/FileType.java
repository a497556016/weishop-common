package com.weishop.global;

/**
 * 0：其他、1：图片、2：word、3：excel、4：压缩包
 * HeShaowei create at 2017年10月30日
 *
 */
public enum FileType {
	OTHER("0"),
	IMAGE("1"),
	WORD("1"),
	EXCEL("1"),
	ZIP("1");
	
	private String type;
	
	private FileType(String type) {
		this.type = type;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
}
