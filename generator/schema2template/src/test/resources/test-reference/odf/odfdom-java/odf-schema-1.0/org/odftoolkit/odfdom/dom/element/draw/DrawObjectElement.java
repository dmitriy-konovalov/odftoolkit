/************************************************************************
 *
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER
 *
 * Copyright 2008, 2010 Oracle and/or its affiliates. All rights reserved.
 *
 * Use is subject to license terms.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy
 * of the License at http://www.apache.org/licenses/LICENSE-2.0. You can also
 * obtain a copy of the License at http://odftoolkit.org/docs/license.txt
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 ************************************************************************/

/*
 * This file is automatically generated.
 * Don't edit manually.
 */
package org.odftoolkit.odfdom.dom.element.draw;

import org.odftoolkit.odfdom.pkg.OdfElement;
import org.odftoolkit.odfdom.dom.DefaultElementVisitor;
import org.odftoolkit.odfdom.pkg.ElementVisitor;
import org.odftoolkit.odfdom.pkg.OdfFileDom;
import org.odftoolkit.odfdom.pkg.OdfName;
import org.odftoolkit.odfdom.dom.OdfDocumentNamespace;
import org.odftoolkit.odfdom.dom.element.math.MathMathElement;
import org.odftoolkit.odfdom.dom.element.office.OfficeDocumentElement;
import org.odftoolkit.odfdom.dom.attribute.draw.DrawNotifyOnUpdateOfRangesAttribute;
import org.odftoolkit.odfdom.dom.attribute.xlink.XlinkActuateAttribute;
import org.odftoolkit.odfdom.dom.attribute.xlink.XlinkHrefAttribute;
import org.odftoolkit.odfdom.dom.attribute.xlink.XlinkShowAttribute;
import org.odftoolkit.odfdom.dom.attribute.xlink.XlinkTypeAttribute;

/**
 * DOM implementation of OpenDocument element  {@odf.element draw:object}.
 *
 */
public class DrawObjectElement extends OdfElement {

	public static final OdfName ELEMENT_NAME = OdfName.newName(OdfDocumentNamespace.DRAW, "object");

	/**
	 * Create the instance of <code>DrawObjectElement</code>
	 *
	 * @param  ownerDoc     The type is <code>OdfFileDom</code>
	 */
	public DrawObjectElement(OdfFileDom ownerDoc) {
		super(ownerDoc, ELEMENT_NAME);
	}

	/**
	 * Get the element name
	 *
	 * @return  return   <code>OdfName</code> the name of element {@odf.element draw:object}.
	 */
	public OdfName getOdfName() {
		return ELEMENT_NAME;
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>DrawNotifyOnUpdateOfRangesAttribute</code> , See {@odf.attribute draw:notify-on-update-of-ranges}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getDrawNotifyOnUpdateOfRangesAttribute() {
		DrawNotifyOnUpdateOfRangesAttribute attr = (DrawNotifyOnUpdateOfRangesAttribute) getOdfAttribute(OdfDocumentNamespace.DRAW, "notify-on-update-of-ranges");
		if (attr != null) {
			return String.valueOf(attr.getValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>DrawNotifyOnUpdateOfRangesAttribute</code> , See {@odf.attribute draw:notify-on-update-of-ranges}
	 *
	 * @param drawNotifyOnUpdateOfRangesValue   The type is <code>String</code>
	 */
	public void setDrawNotifyOnUpdateOfRangesAttribute(String drawNotifyOnUpdateOfRangesValue) {
		DrawNotifyOnUpdateOfRangesAttribute attr = new DrawNotifyOnUpdateOfRangesAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setValue(drawNotifyOnUpdateOfRangesValue);
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>XlinkActuateAttribute</code> , See {@odf.attribute xlink:actuate}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getXlinkActuateAttribute() {
		XlinkActuateAttribute attr = (XlinkActuateAttribute) getOdfAttribute(OdfDocumentNamespace.XLINK, "actuate");
		if (attr != null) {
			return String.valueOf(attr.getValue());
		}
		return XlinkActuateAttribute.DEFAULT_VALUE_ONLOAD;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>XlinkActuateAttribute</code> , See {@odf.attribute xlink:actuate}
	 *
	 * @param xlinkActuateValue   The type is <code>String</code>
	 */
	public void setXlinkActuateAttribute(String xlinkActuateValue) {
		XlinkActuateAttribute attr = new XlinkActuateAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setValue(xlinkActuateValue);
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>XlinkHrefAttribute</code> , See {@odf.attribute xlink:href}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getXlinkHrefAttribute() {
		XlinkHrefAttribute attr = (XlinkHrefAttribute) getOdfAttribute(OdfDocumentNamespace.XLINK, "href");
		if (attr != null) {
			return String.valueOf(attr.getValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>XlinkHrefAttribute</code> , See {@odf.attribute xlink:href}
	 *
	 * @param xlinkHrefValue   The type is <code>String</code>
	 */
	public void setXlinkHrefAttribute(String xlinkHrefValue) {
		XlinkHrefAttribute attr = new XlinkHrefAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setValue(xlinkHrefValue);
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>XlinkShowAttribute</code> , See {@odf.attribute xlink:show}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getXlinkShowAttribute() {
		XlinkShowAttribute attr = (XlinkShowAttribute) getOdfAttribute(OdfDocumentNamespace.XLINK, "show");
		if (attr != null) {
			return String.valueOf(attr.getValue());
		}
		return XlinkShowAttribute.DEFAULT_VALUE_EMBED;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>XlinkShowAttribute</code> , See {@odf.attribute xlink:show}
	 *
	 * @param xlinkShowValue   The type is <code>String</code>
	 */
	public void setXlinkShowAttribute(String xlinkShowValue) {
		XlinkShowAttribute attr = new XlinkShowAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setValue(xlinkShowValue);
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>XlinkTypeAttribute</code> , See {@odf.attribute xlink:type}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getXlinkTypeAttribute() {
		XlinkTypeAttribute attr = (XlinkTypeAttribute) getOdfAttribute(OdfDocumentNamespace.XLINK, "type");
		if (attr != null) {
			return String.valueOf(attr.getValue());
		}
		return XlinkTypeAttribute.DEFAULT_VALUE;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>XlinkTypeAttribute</code> , See {@odf.attribute xlink:type}
	 *
	 * @param xlinkTypeValue   The type is <code>String</code>
	 */
	public void setXlinkTypeAttribute(String xlinkTypeValue) {
		XlinkTypeAttribute attr = new XlinkTypeAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setValue(xlinkTypeValue);
	}

	/**
	 * Create child element {@odf.element math:math}.
	 *
	 * @return the element {@odf.element math:math}
	 */
	public MathMathElement newMathMathElement() {
		MathMathElement mathMath = ((OdfFileDom) this.ownerDocument).newOdfElement(MathMathElement.class);
		this.appendChild(mathMath);
		return mathMath;
	}

	/**
	 * Create child element {@odf.element office:document}.
	 *
	 * @param officeMimetypeValue  the <code>String</code> value of <code>OfficeMimetypeAttribute</code>, see {@odf.attribute  office:mimetype} at specification
	 * @return the element {@odf.element office:document}
	 */
	 public OfficeDocumentElement newOfficeDocumentElement(String officeMimetypeValue) {
		OfficeDocumentElement officeDocument = ((OdfFileDom) this.ownerDocument).newOdfElement(OfficeDocumentElement.class);
		officeDocument.setOfficeMimetypeAttribute(officeMimetypeValue);
		this.appendChild(officeDocument);
		return officeDocument;
	}

  /**
   * Accept an visitor instance to allow the visitor to do some operations. Refer to visitor design
   * pattern to get a better understanding.
   *
   * @param visitor an instance of DefaultElementVisitor
   */
	@Override
	public void accept(ElementVisitor visitor) {
		if (visitor instanceof DefaultElementVisitor) {
			DefaultElementVisitor defaultVisitor = (DefaultElementVisitor) visitor;
			defaultVisitor.visit(this);
		} else {
			visitor.visit(this);
		}
	}
}