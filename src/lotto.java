/**
 * Created by danawacomputer on 2017-04-06.
 */
import java.applet.*;
import java.awt.*;
import java.awt.event.*;
public class lotto extends Applet implements ActionListener{
    Label mg1,mg2,mg3;
    TextField i1,i2,i3,i4,i5,i6,i7,hb;
    TextArea ta;
    int i,j,k,count,co,temp=0;
    int[] dc=new int[7];
    int[][] a=new int[5][6];
    Button r,in;
    String result;
    Panel p=new Panel(new GridLayout(1,7,5,5));

    public void init(){
        mg1= new Label("조 번호를 입력하세요 ->");
        mg2= new Label("금주의 로또 번호를 입력하세요 ->");
        mg3= new Label("보너스 번호를 입력하세요 ->");
        i1=new TextField(2); i2=new TextField(2); i3=new TextField(2); i4=new TextField(2);
        i5=new TextField(2); i6=new TextField(2); i7=new TextField(2); hb=new TextField(15);
        ta=new TextArea();
        r=new Button("재입력");
        in=new Button("결과보기");

        add(mg1); add(hb);
        p.add(i1); p.add(i2); p.add(i3); p.add(i4); p.add(i5); p.add(i6);
        add(mg2); add(p);
        add(mg3); add(i7);
        add(r);
        add(in);
        add(ta);

        i1.addActionListener(ii); i2.addActionListener(ii);
        i3.addActionListener(ii); i4.addActionListener(ii);
        i5.addActionListener(ii); i6.addActionListener(ii);
        i7.addActionListener(ii); hb.addActionListener(ii);
        r.addActionListener(rr);
        in.addActionListener(ii);
    }

    ActionListener ii = new ActionListener(){
        public void actionPerformed(ActionEvent evt){
            dc[0]=Integer.parseInt(i1.getText());
            dc[1]=Integer.parseInt(i2.getText());
            dc[2]=Integer.parseInt(i3.getText());
            dc[3]=Integer.parseInt(i4.getText());
            dc[4]=Integer.parseInt(i5.getText());
            dc[5]=Integer.parseInt(i6.getText());
            dc[6]=Integer.parseInt(i7.getText());
            a[0][0]=1; a[0][1]=2; a[0][2]=3; a[0][3]=4; a[0][4]=5; a[0][5]=6;
            for(i=1;i<=4;i++){
                for(j=0;j<=5;j++){
                    a[i][j]=(int)(Math.random()*44)+1;
                }
            }
            for(i=0;i<=4;i++)
            {
                ta.append(""+(i+1)+"세트 번호(");
                for(j=0;j<=5;j++){
                    ta.append(""+a[i][j]+" ");
                }
                ta.append(""+") ->");
                count=0;
                co=0;
                temp=0;
                for(j=0;j<=5;j++)
                {
                    for(k=0;k<=6;k++)
                    {
                        if(a[i][j]==dc[k]){
                            if(a[i][j]==dc[6]){
                                ta.append(""+"bonus ");
                                co=1;
                                temp=1;
                            }
                            else{
                                ta.append(""+a[i][j]+" ");
                                count=count+1;
                                temp=1;
                            }
                        }
                    }
                    if((temp==0))ta.append(""+"x ");
                    if(j==5){
                        if(count==6)
                            ta.append(""+"(1등)\n");
                        else if(count==5){
                            if(co==1)
                                ta.append(""+"(2등)\n");
                            else
                                ta.append(""+"(3등)\n");
                        }
                        else if(count==4)
                            ta.append(""+"(4등)\n");
                        else if(count==3)
                            ta.append(""+"(5등)\n");
                        else
                            ta.append(""+"(꽝)\n");
                    }
                }
            }

        }
    };



    ActionListener rr = new ActionListener(){
        public void actionPerformed(ActionEvent evt){
            i1.setText(""); i2.setText(""); i3.setText(""); i4.setText(""); i5.setText("");
            i6.setText(""); i7.setText(""); hb.setText(""); ta.setText("");
        }
    };

    @Override
    public void actionPerformed(ActionEvent arg0) {
        // TODO Auto-generated method stub

    }
}
