/** 
 * Copyright 2018-2028 Akaxin Group
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License. 
 */
package com.akaxin.common.constant;

/**
 * <pre>
 * 站点服务端的错误信息
 * 		1.每个请求，成功状态只有一种状态
 * 		2.错误需要提示用户使用code=error.alter，客户端能够展示错误信息
 * 		3.其他错误使用code=error 客户端默认提示请求失败或者不展示错误提示
 * </pre>
 * 
 * @author Sam{@link an.guoyue254@gmail.com}
 * @since 2018-01-02 18:05:31
 */
public enum ErrorCode2 {
	SUCCESS("success", ""), // 操作成功

	ERROR_SYSTEMERROR("error.alter", "系统异常"), //
	ERROR_PARAMETER("error.alter", "请求参数错误"), // 请求参数错误
	ERROR_NOPERMISSION("error.alter", "用户无权限该操作"), // 用户无权限错误
	ERROR_UNSUPPORT_PROTOCOL("error.alter", "协议版本错误"), // 服务端不支持该功能
	ERROR_ILLEGALREQUEST("error.alter", "非法请求"), // 非法的请求
	ERROR_INVALIDPACKAGEACTION("error.alter", "无效的包名称"), // 无效的包action
	ERROR_SESSION_VALIDATE("error.alter", "用户身份验证失败，请退出重新操作"), // 请求用户身份验证失败

	ERROR_REGISTER("error.alter", "用户注册失败"), // 用户注册失败
	ERROR_REGISTER_SAVEPROFILE("error.alter", "保存用户数据失败"), // 用户注册失败
	ERROR_REGISTER_UIC("error.alter", "用户邀请码错误"), // 用户邀请码错误
	ERROR_REGISTER_PHONEID("error.alter", "用户实名手机号验证错误"), // 验证手机号失败

	ERROR2_USER_SAVE_PUSHTOKEN("error.alter", "保存数据失败"), //
	ERROR2_USER_UPDATE_PROFILE("error.alter", "更新数据库用户身份失败"), //

	ERROR2_FRIEND_IS("error.alter", "用户已经是你的好友"), //
	ERROR2_FRIEND_APPLYSELF("error.alter", "用户不能添加自己为好友"), //
	ERROR2_FRIEND_APPLYCOUNT("error.alter", "添加好友最多为5次"), //

	ERROR_GROUP_MAXMEMBERCOUNT("error.alter", "超过群人数上限"), // 添加群成员，人数超过上限
	ERROR_GROUP_MEMBERLESS3("error.alter", "创建群成员少于三人"), //

	ERROR2_LOGGIN_USERID_EMPTY("error.alter", "用户身份为空"), // 用户身份校验失败
	ERROR2_LOGGIN_DEVICEID_EMPTY("error.alter", "设备身份为空"), // 用户身份校验失败
	ERROR2_LOGGIN_UPDATE_DEVICE("error.alter", "更新设备失败"), // 更新设备失败
	ERROR2_LOGGIN_UPDATE_SESSION("error.alter", "保存session失败"), // 保存session
	ERROR2_LOGGIN_ERRORSIGN("error.alter", "用户身份校验失败，请重新登陆"), // 用户身份校验失败
	ERROR2_LOGGIN_NOREGISTER("error.login.need_register", ""), // 用户需要在该站点注册
	ERROR2_LOGGIN_SEALUPUSER("error.alter", "当前用户无权登陆"), // 用户需要在该站点注册

	ERROR2_IMAUTH_FAIL("error.alter", "im连接认证失败"), // 用户需要在该站点注册

	ERROR2_PHONE_EXIST("error.alter", "该手机号码已经其他账号实名"), //
	ERROR2_PHONE_VERIFYCODE("error.alter", "验证码验证失败"), //
	ERROR2_PHONE_GETVERIFYCODE("error.alter", "获取验证码失败"), //
	ERROR2_PHONE_FORMATTING("error.alter", "不支持的手机号"), //

	ERROR2_PLUGIN_STATUS("error.alter", "扩展状态错误"), //

	ERROR2_SECRETCHAT_CLOSE("error.alter", "站点服务不支持绝密聊天"), //

	ERROR("error.alter", "请求失败"); // 默认未知错误

	private String code;
	private String info;

	ErrorCode2(String code, String info) {
		this.code = code;
		this.info = info;
	}

	public String getCode() {
		return this.code;
	}

	public String getInfo() {
		return this.info;
	}

	public boolean isSuccess() {
		return "success".equals(this.code) ? true : false;
	}

	public String toString() {
		return "errCode:" + this.code + " errInfo:" + this.info;
	}
}
