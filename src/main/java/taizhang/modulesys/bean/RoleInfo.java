package taizhang.modulesys.bean;

import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class RoleInfo {
	private int id;
	private String name;
	private String description;
	private String createTime;
	private String updateTime;
	private List<PermInfo> permList;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getCreateTime() {
		return createTime;
	}
	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}
	public String getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(String updateTime) {
		this.updateTime = updateTime;
	}
	public List<PermInfo> getPermList() {
		return permList;
	}
	public void setPermList(List<PermInfo> permList) {
		this.permList = permList;
	}
	
	
	
}
