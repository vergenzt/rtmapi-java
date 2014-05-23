package bova.rtmapi;




/**
 * An enum for the possible server permissions
 * @author Giovanni Pini
 *
 */
public enum Permission {
	/**
	 * No permission
	 */
	NONE("none"),
	/**
	 * gives the ability to read task, contact, group and list details and contents.
	 */
	READ("read"),
	/**
	 * gives the ability to add and modify task, contact, group and list details and contents (also allows you to <b>read</b>).
	 */
	WRITE("write"),
	/**
	 * gives the ability to delete tasks, contacts, groups and lists (also allows you to <b>read</b> and <b>write</b>).
	 */
	DELETE("delete");
	private String permission;
	private Permission(String perm) {this.permission = perm; }
	public String toString() {return this.permission; }
}