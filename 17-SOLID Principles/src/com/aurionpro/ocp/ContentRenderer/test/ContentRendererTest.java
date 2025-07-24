package com.aurionpro.ocp.ContentRenderer.test;

import com.aurionpro.ocp.ContentRenderer.model.Content;
import com.aurionpro.ocp.ContentRenderer.model.Video;

public class ContentRendererTest {
public static void main(String[] args) {
		Content content=new Content();
		
		content.render(new Video());
}
}
