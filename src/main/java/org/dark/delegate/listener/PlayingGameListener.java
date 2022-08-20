package org.dark.delegate.listener;

import java.util.Date;

/**
 * @Title : 具体的观察者类2，不再需要抽象观察者
 * @Description	:	按照前面對Event類的解釋，它就是一條魚了
 * @author liwei
 *
 */
public class PlayingGameListener {

	public PlayingGameListener() {
		System.out.println("playing");
	}

	/**
	 * @Description	:	我稱這些方法為耳朵方法
	 * 						或者可以說，被監聽者（觀察者、被通知者，叫什麼無所謂啦）的任何一個方法都可以是一隻耳朵
	 * 						用來接收監聽者發送的消息
	 * @param date
	 */
	public void stopPlayingGame(Date date) {
		System.out.println("stop playing" + date.toLocaleString());
	}
}