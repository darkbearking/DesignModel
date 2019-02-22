package org.dark.delegate.notifier;

import org.dark.delegate.event.EventHandler;

/**
 * @Title 		: 	֪ͨ�߳�����
 * @Description:	��ǰ������ţ�㕽��¼�������cҪ�����Č���
 * @author liwei
 *
 */
public abstract class Notifier {
	private EventHandler eventHandler = new EventHandler();

	public EventHandler getEventHandler() {
		return eventHandler;
	}

	public void setEventHandler(EventHandler eventHandler) {
		this.eventHandler = eventHandler;
	}

	/**
	 * @Description:	��ӱO �ߣ���֪ͨ�ߣ�
	 * @param object
	 * @param methodName
	 * @param args
	 */
	public abstract void addListener(Object object, String methodName, Object... args);

	public abstract void notifyX();

}