package org.dark.delegate.event;

import java.lang.reflect.Method;

/**
 * @Title : 事件类
 * @Description:
 * @author liwei
 *
 */
public class Event {
	private Object object;

	private String methodName;

	private Object[] params;

	private Class[] paramTypes;

	//對某個類的某個方法綁定事件
	public Event(Object object, String method, Object... args) {
		this.object = object;
		this.methodName = method;
		this.params = args;
		contractParamTypes(this.params);
	}

	//獲取方法的各个入参类型
	private void contractParamTypes(Object[] params) {
		this.paramTypes = new Class[params.length];
		for (int i = 0; i < params.length; i++) {
			this.paramTypes[i] = params[i].getClass();
		}
	}

	//調用外部類的某個方法
	public void invoke() throws Exception {
		Method method = object.getClass().getMethod(this.methodName, this.paramTypes);
		
		// 判断是否存在这个函数
		if (null == method) {
			return;
		}
		
		// 利用反射机制调用函数
		method.invoke(this.object, this.params);
	}
}
