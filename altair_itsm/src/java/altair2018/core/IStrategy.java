/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package altair2018.core;

import altair2018.domain.DomainEntity;

/**
 *
 * @author Luiz
 */
public interface IStrategy {
    public String process(DomainEntity entity);
}
