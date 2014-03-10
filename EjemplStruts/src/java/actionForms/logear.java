/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package actionForms;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

/**
 *
 * @author rcerrato
 */
public class logear extends org.apache.struts.action.ActionForm {
    
    private String nombre;
    

    /**
     * @return
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param string
     */
    public void setNombre(String string) {
        nombre = string;
    }

    /**
     * @return
     */
    

    /**
     * @param i
     */
   

    /**
     *
     */
    public logear() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * This is the action called from the Struts framework.
     * @param mapping The ActionMapping used to select this instance.
     * @param request The HTTP Request we are processing.
     * @return
     */
    public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
        ActionErrors errors = new ActionErrors();
        if ("".equals(getNombre())){
            errors.add("nombreObligatorio", new ActionMessage("errors.obligatorio"));
            mapping.getInputForward();
        }
        return errors;
    }
}
