/*
 * Copyright (C) 2018 Taktik SA
 *
 * This file is part of iCureBackend.
 *
 * iCureBackend is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License version 2 as published by
 * the Free Software Foundation.
 *
 * iCureBackend is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with iCureBackend.  If not, see <http://www.gnu.org/licenses/>.
 */

package org.taktik.icure.dto.gui.editor;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;
import org.taktik.icure.dto.gui.Editor;
import org.taktik.icure.dto.gui.layout.FormLayoutData;

/**
 * Created by aduchate on 03/12/13, 22:23
 */
@XStreamAlias("Label")
public class Label extends Editor {
	
	@XStreamAsAttribute
	FormLayoutData formData;

	public FormLayoutData getFormData() {
		return formData;
	}

	public void setFormData(FormLayoutData formData) {
		this.formData = formData;
	}
}
