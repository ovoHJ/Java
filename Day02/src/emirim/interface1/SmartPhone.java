package emirim.interface1;

public interface SmartPhone extends MobilePhone {
	public void installApp(String type);
	public void uninstallApp(String type);
	public void runCamera();
	public void editCamera();
}