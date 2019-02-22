package org.dark.delegate.event;

import java.util.ArrayList;
import java.util.List;

/**
 * @Title 		: 	�¼�̎����
 * @Description:	��������Ҫ�ǌ��������¼�������������K������Ҫ�ĕr��ͨ�^�¼��{�ý���Ľ�������
 * 					���ǰ���Event��~�M���˳���̎�����N�@��������~�ďN����
 * 					�N���e���Ђ}�죨List<Event>����߀�����~����̨��notifyX()��
 * @author liwei
 *
 */
public class EventHandler {

	private List<Event> objects;

	public EventHandler() {
		objects = new ArrayList<Event>();
	}

	//����������¼���������
	public void addEvent(Object object, String methodName, Object... args) {
		objects.add(new Event(object, methodName, args));
	}

	//�L��ÿ������Ľ�������
	public void notifyX() throws Exception {
		for (Event event : objects) {
			event.invoke();
		}
	}
}