package multishell001;


import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

public class MultiShell {
	
	public static void main(String[] args) {
		Display display = new Display();
		
		Shell shell = new Shell(display,SWT.SHELL_TRIM);
		shell.setText("�ര��ʵ��");
		shell.setSize(300,200);
//		shell.setImage(new Image(display, );
		
		Button button = new Button(shell, SWT.CENTER);
		button.setText("�����Ӵ���");
		button.addSelectionListener(new SelectionAdapter() {

			/**  
			* @author codingManLiu
			* @date 2019��8��5�� ����8:05:47
			* @version 1.0  
			* @param @param e    ����
			* @Description: TODO(������һ�仰�����������������		
			 */  
			@Override
			public void widgetSelected(SelectionEvent e) {
//				super.widgetSelected(e);
				createChildShell(shell,"�Ӵ���");
			}

		});
		
		button.pack();
		
		shell.open();
		
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}

	}

	/**  
	* @author codingManLiu
	* @date 2019��8��5�� ����8:06:41
	* @version V0.0.1  
	* @param shell
	* @param string    ����
	* @return void    ��������
	* @Description: TODO(������һ�仰�����������������)
	 */  
	protected static Shell createChildShell(Shell shell, String string) {
//		Shell shell2 = new Shell(shell,SWT.DIALOG_TRIM);
//		Shell shell2 = new Shell(shell,SWT.SHELL_TRIM);
		Shell shell2 = new Shell(shell,SWT.NO_TRIM);
		shell2.setText(string);
		shell2.setSize(100,100);
		shell2.open();
		return shell;	
	}

}
