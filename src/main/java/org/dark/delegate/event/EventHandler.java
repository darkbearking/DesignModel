package org.dark.delegate.event;

import java.util.ArrayList;
import java.util.List;

/**
 * @Title 		: 	事件處理类
 * @Description:	其作用主要是將綁定了事件的類們管理起來。並且在需要的時候，通過事件調用綁定類的綁定方法
 * 					如果前面的Event類將魚進行了初步處理。那麼這個類就是做魚的廚房。
 * 					廚房裡既有倉庫（List<Event>）。還有烹魚的灶台（notifyX()）
 * @author liwei
 *
 */
public class EventHandler {

	private List<Event> objects;

	public EventHandler() {
		objects = new ArrayList<Event>();
	}

	//將綁定了類的事件管理起來
	public void addEvent(Object object, String methodName, Object... args) {
		objects.add(new Event(object, methodName, args));
	}

	//訪問每個綁定類的綁定方法
	public void notifyX() throws Exception {
		for (Event event : objects) {
			event.invoke();
		}
	}
}