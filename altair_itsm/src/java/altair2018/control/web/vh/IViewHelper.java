/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package altair2018.control.web.vh;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import altair2018.core.application.Result;
import altair2018.domain.DomainEntity;

/**
 *
 * @author Luiz
 */
public interface IViewHelper {
    
    public DomainEntity getEntity(HttpServletRequest request);
    
    public void setView(Result result, HttpServletRequest request, HttpServletResponse response)throws IOException, ServletException;
}
