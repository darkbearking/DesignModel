package org.dark.delegate.notifier;

/**
 * @Title 		: 	֪ͨ�߾���ʵ����
 * @Description:	��Ŀ��������¼�̎����ϣ��K�{���¼�̎��Č��������{�ñ��������Ŀ�˷���
 * @author liwei
 *
 */
public class ConcreteNotifier extends Notifier {

	/**
	 * @Description:	��ӱO �ߣ���֪ͨ�ߣ�
	 * 					���¼�̎����@Щ�O ������¼���
	 * 					�����f��׌�O �ߵ�ĳ�����䣨������������¼�֪ͨ�߰l������Ϣ
	 * 
	 * 					����ǰ����f�����@�e���ǰ��~�͵��N���Ĳ�����
	 * @param object
	 * @param methodName
	 * @param args
	 */
	@Override
	public void addListener(Object object, String methodName, Object... args) {
		this.getEventHandler().addEvent(object, methodName, args);
	}

	/**
	 * @Description:	���~��Ȼ�� ���~�đK�У������@������Ҫ�������ˡ�
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