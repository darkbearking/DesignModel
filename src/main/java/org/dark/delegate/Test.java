package org.dark.delegate;

import java.util.Date;

import org.dark.delegate.listener.PlayingGameListener;
import org.dark.delegate.listener.WatchingTVListener;
import org.dark.delegate.notifier.ConcreteNotifier;
import org.dark.delegate.notifier.Notifier;

/**
 * @Title : 測試類
 * @Description:
 * @author liwei
 *
 */
public class Test {

	public static void main(String[] args) {
		Notifier goodNotifier = new ConcreteNotifier();

		PlayingGameListener playingGameListener = new PlayingGameListener();
		WatchingTVListener watchingTVListener = new WatchingTVListener();

		goodNotifier.addListener(playingGameListener, "stopPlayingGame", new Date());
		goodNotifier.addListener(watchingTVListener, "stopWatchingTV", new Date());
		goodNotifier.notifyX();
	}

}