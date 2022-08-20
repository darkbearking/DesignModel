package org.dark.delegate.event;

import java.lang.reflect.Method;

/**
 * @Title	:	事件類
 * 				將它獨立出來的目的，是用它來操作實體bean類或者功能類
 * 				如果將實體bean視為一整條魚的話
 * 				那麼這個類就是能把魚大卸八塊後獲得到了魚頭、魚骨、魚肉等零件的工具（同時它也把魚的零件放在自己這裡存起來）
 * 				感覺這個類的存在，純粹是為了滿足和符合單一職責原則。
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
