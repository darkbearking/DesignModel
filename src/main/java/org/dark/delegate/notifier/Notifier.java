package org.dark.delegate.notifier;

import org.dark.delegate.event.EventHandler;

/**
 * @Title 		: 	通知者抽象类
 * @Description:	當前類作為橋樑，銜接事件管理類與要綁定的對象
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
	 * @Description:	添加監聽者（被通知者）
	 * @param object
	 * @param methodName
	 * @param args
	 */
	public abstract void addListener(Object object, String methodName, Object... args);

	public abstract void notifyX();

}