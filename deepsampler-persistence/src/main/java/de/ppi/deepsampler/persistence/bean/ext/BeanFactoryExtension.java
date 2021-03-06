/*
 * Copyright 2020  PPI AG (Hamburg, Germany)
 * This program is made available under the terms of the MIT License.
 */

package de.ppi.deepsampler.persistence.bean.ext;


import de.ppi.deepsampler.persistence.model.PersistentBean;

public interface BeanFactoryExtension {
    boolean isProcessable(Class<?> beanCls);
    boolean skip(Class<?> beanCls);

    PersistentBean toBean(Object bean);
    <T> T ofBean(PersistentBean bean, Class<T> target);
}
