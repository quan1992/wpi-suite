/*******************************************************************************
 * Copyright (c) 2013 -- WPI Suite
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    TODO: Contributors' names
 ******************************************************************************/

package edu.wpi.cs.wpisuitetng.modules.planningpoker.view;

import edu.wpi.cs.wpisuitetng.janeway.gui.container.toolbar.DefaultToolbarView;
import edu.wpi.cs.wpisuitetng.modules.planningpoker.view.toolbar.AdminButtons;
import edu.wpi.cs.wpisuitetng.modules.planningpoker.view.toolbar.CommonButtons;

/**
 * This is the main class for the planning poker toolbar
 * @author llhunker, blammeson
 *
 */
@SuppressWarnings("serial")
public class ToolbarView extends DefaultToolbarView {

	private CommonButtons commonButtons = new CommonButtons();
	private AdminButtons adminButtons = new AdminButtons();
	
	public ToolbarView (){
		this.addGroup(commonButtons);
		this.addGroup(adminButtons);
	}
}
