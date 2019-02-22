package org.dark.delegate.event;

import java.lang.reflect.Method;

/**
 * @Title : �¼���
 * @Description:
 * @author liwei
 *
 */
public class Event {
	private Object object;

	private String methodName;

	private Object[] params;

	private Class[] paramTypes;

	//��ĳ���ĳ�����������¼�
	public Event(Object object, String method, Object... args) {
		this.object = object;
		this.methodName = method;
		this.params = args;
		contractParamTypes(this.params);
	}

	//�@ȡ�����ĸ����������
	private void contractParamTypes(Object[] params) {
		this.paramTypes = new Class[params.length];
		for (int i = 0; i < params.length; i++) {
			this.paramTypes[i] = params[i].getClass();
		}
	}

	//�{���ⲿ�ĳ������
	public void invoke() throws Exception {
		Method method = object.getClass().getMethod(this.methodName, this.paramTypes);
		
		// �ж��Ƿ�����������
		if (null == method) {
			return;
		}
		
		// ���÷�����Ƶ��ú���
		method.invoke(this.object, this.params);
	}
}
