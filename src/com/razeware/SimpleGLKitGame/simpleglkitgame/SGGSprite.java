/*
 * Copyright (c) 2014 MyAppConverter
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the MyAppConverter License v1.0
 * which accompanies this distribution, and is available at
 * http://www.myappconverter.com/legal/epl-v1.html
 *
 * Contributors:
 *    MyAppConverter Core Team - initial API and implementation
 * @date : Dec, 02 2014 - 13:57:39
 */

package com.razeware.SimpleGLKitGame.simpleglkitgame;

import com.razeware.SimpleGLKitGame.simpleglkitgame.impl.SGGNode;
import com.myappconverter.java.foundations.NSString;
import com.myappconverter.java.glkit.GLKBaseEffect;

public abstract class SGGSprite extends SGGNode {

	/**
	 * Method : initWithFile <!-- begin-user-doc -->
	 * 
	 * @return SGGSprite.
	 * @generated
	 */
	public abstract SGGSprite initWithFile(NSString fileName, GLKBaseEffect effect);

}
