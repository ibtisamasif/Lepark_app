package com.codextech.ibtisam.lepak_app.util;

import android.app.ProgressDialog;
import android.content.Context;
@Deprecated
public class ProgressDialogUtils {
	private static ProgressDialog mProgressDialog;
	public static void showProgressDialog(Context context, CharSequence message){
		if(mProgressDialog == null){
			mProgressDialog = ProgressDialog.show(context, "", message);
			mProgressDialog.setCancelable(true);
		}else{
			mProgressDialog.show();
		}
	}
	public static void dismissProgressDialog(){
		if(mProgressDialog != null){
			mProgressDialog.dismiss();
			mProgressDialog = null;
		}
	}
}
