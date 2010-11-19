package br.inf.carlos.wfg.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * This annotation marks all beans to render an form.jsp in WEB directory.
 * 
 * @author Carlos A. Junior
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface WebFormBean
{
	/**
	 * The name of bean to be used in EL script in JSP pages.
	 * 
	 * @return String elVarName
	 */
	public String elVarName();
	
	/**
	 * The folder name of controller of VRaptor.
	 * 
	 * @return String controllerName
	 */
	public String controllerFolderName();
	
	/**
	 * The action URL of HTML Form.
	 *  
	 * @return
	 */
	public String formActionTarget() 	default "";
	
	/**
	 * The submit type.
	 * 
	 * @return
	 */
	public String method() 				default "post";
}
