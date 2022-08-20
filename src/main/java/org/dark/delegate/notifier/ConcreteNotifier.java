package org.dark.delegate.notifier;

/**
 * @Title 		: 	通知者具体实现类
 * @Description:	將目標類綁定至事件處理類上，並調用事件處理類的對應方法調用被綁定的類的目標方法
 * @author liwei
 *
 */
public class ConcreteNotifier extends Notifier {

	/**
	 * @Description:	添加監聽者（被通知者）
	 * 					令事件處理類為這些監聽者添加事件。
	 * 					或者說，讓監聽者的某個耳朵（方法）來接受事件通知者發出的消息
	 *
	 * 					按照前面的說法，這裡就是把魚送到廚房的操作了
	 * @param object
	 * @param methodName
	 * @param args
	 */
	@Override
	public void addListener(Object object, String methodName, Object... args) {
		this.getEventHandler().addEvent(object, methodName, args);
	}

	/**
	 * @Description:	殺魚，然後聽到魚的慘叫，就是這個方法要做的事了。
	 */
	@Override
	public void notifyX() {
		try {
			this.getEventHandler().notifyX();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}