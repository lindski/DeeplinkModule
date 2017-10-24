// This file was generated by Mendix Modeler.
//
// WARNING: Only the following code will be retained when actions are regenerated:
// - the import list
// - the code between BEGIN USER CODE and END USER CODE
// - the code between BEGIN EXTRA CODE and END EXTRA CODE
// Other code you write will be lost the next time you deploy the project.
// Special characters, e.g., é, ö, à, etc. are supported in comments.

package deeplink.actions;

import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.webui.CustomJavaAction;

/**
 * Returns the Session ID of the current Session.
 */
public class GetCurrentSessionID extends CustomJavaAction<String>
{
	public GetCurrentSessionID(IContext context)
	{
		super(context);
	}

	@Override
	public String executeAction() throws Exception
	{
		// BEGIN USER CODE
		return getContext().getSession().getId().toString();
		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 */
	@Override
	public String toString()
	{
		return "GetCurrentSessionID";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}
