package com.xiaomingming.api.vo.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseFoForder<M extends BaseFoForder<M>> extends Model<M> implements IBean {

	public void setId(java.lang.Integer id) {
		set("id", id);
	}
	
	public java.lang.Integer getId() {
		return getInt("id");
	}

	public void setFoName(java.lang.String foName) {
		set("fo_name", foName);
	}
	
	public java.lang.String getFoName() {
		return getStr("fo_name");
	}

	public void setFoCreateTime(java.lang.Integer foCreateTime) {
		set("fo_create_time", foCreateTime);
	}
	
	public java.lang.Integer getFoCreateTime() {
		return getInt("fo_create_time");
	}

	public void setPrId(java.lang.Integer prId) {
		set("pr_id", prId);
	}
	
	public java.lang.Integer getPrId() {
		return getInt("pr_id");
	}

}