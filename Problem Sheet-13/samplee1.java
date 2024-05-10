import java.awt.*; 
import java.applet.*; 
/* 
<applet code="ParamDemo" width=300 height=300> 
<param name=fontName value=Courier> 
<param name=fontSize value=14> 
<param name=leading value=2> 
<param name=accountEnabled value=true> 
</applet> 
*/ 
public class samplee1 extends Frame 
{ 
 String fn=null,fz=null,l=null,ae=null; 
 public void init() 
 { 
 setBackground(Color.gray); 
 setForeground(Color.white); 
 }
 public void start() 
 { 
 fn=getParameter("fontName"); 
 fz=getParameter("fontSize"); 
 l=getParameter("leading"); 
 ae=getParameter("accountEnabled"); 
 repaint(); 
 } 
  
 public void paint(Graphics g) 
 { 
 g.drawString("FontName:"+fn,10,10);  
 g.drawString("FontSize:"+fz,10,30); 
 g.drawString("Leading:"+l,10,50); 
 g.drawString("AccountEnabled:"+ae,10,70);  
 } 
} 
