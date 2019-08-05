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
		shell.setText("多窗口实例");
		shell.setSize(300,200);
//		shell.setImage(new Image(display, );
		
		Button button = new Button(shell, SWT.CENTER);
		button.setText("创建子窗口");
		button.addSelectionListener(new SelectionAdapter() {

			/**  
			* @author codingManLiu
			* @date 2019年8月5日 下午8:05:47
			* @version 1.0  
			* @param @param e    参数
			* @Description: TODO(这里用一句话描述这个方法的作用		
			 */  
			@Override
			public void widgetSelected(SelectionEvent e) {
//				super.widgetSelected(e);
				createChildShell(shell,"子窗口");
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
	* @date 2019年8月5日 下午8:06:41
	* @version V0.0.1  
	* @param shell
	* @param string    参数
	* @return void    返回类型
	* @Description: TODO(这里用一句话描述这个方法的作用)
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
