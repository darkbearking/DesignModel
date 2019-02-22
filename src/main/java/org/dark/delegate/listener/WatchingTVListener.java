package org.dark.delegate.listener;

import java.util.Date;

/**
 * @Title : 具体的观察者类1，不再需要抽象观察者
 * @Description:
 * @author liwei
 *
 */
public class WatchingTVListener {

	public WatchingTVListener() {
		System.out.println("watching TV");
	}

	/**
	 * @Description	:	我稱這些方法為耳朵方法
	 * 						或者可以說，被監聽者（觀察者、被通知者，叫什麼無所謂啦）的任何一個方法都可以是一隻耳朵
	 * 						用來接收監聽者發送的消息
	 * @param date
	 */
	public void stopWatchingTV(Date date) {
		System.out.println("stop watching" + date.toLocaleString());
	}
}