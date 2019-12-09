
package software.xdev.vaadin.maps.leaflet.flow.data;

/*-
 * #%L
 * vaadin-maps-leaflet-flow
 * %%
 * Copyright (C) 2019 XDEV Software
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */

public class LDivIcon extends LIcon
{

	private String className = "leaflet-div-icon";
//	private final List<Integer> iconSize = new ArrayList<>();
//	private final List<Integer> iconAnchor = new ArrayList<>();
	private String html;

	public LDivIcon()
	{
		this.setIconSize(25, 41);
		this.setIconAnchor(0, 0);
		super.setType("DivIcon");
	}


//	@Override
//	public List<Integer> getIconSize()
//	{
//		return this.iconSize;
//	}
//
//	/**
//	 * Sets icon size in px.
//	 *
//	 * @param iconSize
//	 */
//	@Override
//	public void setIconSize(final int x, final int y)
//	{
//		this.iconSize.clear();
//		this.iconSize.add(x);
//		this.iconSize.add(y);
//	}

//	@Override
//	public List<Integer> getIconAnchor()
//	{
//		return this.iconAnchor;
//	}
//
//	/**
//	 * Anchor point vor the Icon image for fixing offsets
//	 *
//	 * @param iconAnchor
//	 */
//	@Override
//	public void setIconAnchor(final int x, final int y)
//	{
//		this.iconAnchor.clear();
//		this.iconAnchor.add(x);
//		this.iconAnchor.add(y);
//	}

	public String getClassName()
	{
		return this.className;
	}

	/**
	 * Sets a className for CSS formating.
	 *
	 * @param className
	 */
	public void setClassName(final String className)
	{
		this.className = className;
	}

	public String getHtml()
	{
		return this.html;
	}

	/**
	 * Custom HTML code to put inside the div element, empty by default. Alternatively, an instance of HTMLElement.
	 *
	 * @param html
	 */
	public void setHtml(final String html)
	{
		this.html = html;
	}
}
