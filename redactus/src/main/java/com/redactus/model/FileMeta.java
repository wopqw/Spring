package com.redactus.model;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
@JsonIgnoreProperties({"bytes"})
public class FileMeta {
	private String fileName;
	private String fileSize;
	private String fileType;
	private String uuid;
	private byte[] bytes;
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public String getFileSize() {
		return fileSize;
	}
	public void setFileSize(String fileSize) {
		this.fileSize = fileSize;
	}
	public String getFileType() {
		return fileType;
	}
	public void setFileType(String fileType) {
		this.fileType = fileType;
	}
	public byte[] getBytes() {
		return bytes;
	}
	public void setBytes(byte[] bytes) {
		this.bytes = bytes;
	}
	public String getUuid(){
		return this.uuid;
	}
	public void setFileUuid(String uuid){
		this.uuid = uuid;
	}
}