package com.example.unit3day1retro;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

public class ResponseDTO implements Serializable {

	@SerializedName("data")
	private DataDTO data;

	@SerializedName("success")
	private boolean success;

	@SerializedName("status")
	private int status;

	public DataDTO getData(){
		return data;
	}

	public boolean isSuccess(){
		return success;
	}

	public int getStatus(){
		return status;
	}

	@Override
 	public String toString(){
		return 
			"ResponseDTO{" + 
			"data = '" + data + '\'' + 
			",success = '" + success + '\'' + 
			",status = '" + status + '\'' + 
			"}";
		}
}