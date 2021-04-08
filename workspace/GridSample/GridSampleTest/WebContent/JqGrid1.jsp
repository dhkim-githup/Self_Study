<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>

<head lang="en">

    <meta charset="UTF-8">

    <title></title>

    <link rel="stylesheet" type="text/css" media="screen" href="../js/JqGrid/css/jquery-ui-1.11.1.min.css" />
    <link rel="stylesheet" type="text/css" media="screen" href="../js/JqGrid/css/ui.jqgrid.css" />

    <script src="./js/JqGrid/js/jquery-1.11.0.min.js" type="text/javascript"></script>
    <script src="./js/JqGrid/js/jquery-ui-1.11.1.min.js" type="text/javascript"></script>
    <script src="./js/JqGrid/js/i18n/grid.locale-kr.js" type="text/javascript"></script>
    <script src="./js/JqGrid/js/jquery.jqGrid.min.js" type="text/javascript"></script>

    <script type="text/javascript">

    	// 테스트 formatter
	    function currencyFmatter (cellvalue, options, options)
	    {
		   // do something here
	       // return new_format_value;
	       // return new_format_value;  
		      return cellvalue;  
		   
	    }

	    // 숫자 콤마 
	    function chgFmatter(cellvalue, options, options){
	    	var len, point, str;  
	    	 
	        point = cellvalue.length % 3 ;
	        len = cellvalue.length; 
	       
	        str = cellvalue.substring(0, point); 
	        while (point < len) { 
	            if (str != "") str += ","; 
	            str += cellvalue.substring(point, point + 3); 
	            point += 3; 
	        } 
	         
	        return str;
	    	
		}

    
        $(function(){
            // 변수 선언
            var i, max, myData, grid = $("#list4");

            

            // grid 설정

            grid.jqGrid({
                datatype: "local",
                height: 'auto',
                width: 'auto',
                colNames:['Inv No','행복나래 주문일자','주문종류', '행복나래주문번호', '주문자','상품코드','품명','SPEC','모델명','단위', '주문수량', '배송완료수량','단가','금액','진행상태',
                          'hidden1','hidden2','hidden3','hidden4','hidden5','hidden6','hidden7','hidden8','hidden9','hidden10',
                          'hidden11','hidden12','hidden13','hidden14','hidden15','hidden16','hidden17','hidden18','hidden19','hidden20'],                          
                colModel:[
                	{name:'id', width:60, sorttype:"int", align : 'center'},
                	{name:'ords_mk_dati', width:100, align : 'center'},
                	{name:'ords_kn', width:100, align : 'center'},
                	{name:'ords_num', width:130, align : 'center'},
                	{name:'cust_nm', width:200},
                	{name:'prd_cd', width:100, formatter:currencyFmatter},
                	{name:'plis_nm', width:200},
                	{name:'spec', width:200},
                	{name:'mdl_nm', width:100},
                	{name:'unit', width:50, align : 'center'},
                	{name:'cnt', width:50, align : 'right', formatter:chgFmatter},
                	{name:'comp',width:50, align : 'right'},                	
                	{name:'upri', width:50, align : 'right', formatter:chgFmatter},
                	{name:'pri', width:50, align : 'right',formatter:chgFmatter },
                	{name:'proc_nm', width:50},
                	{name:'hidden1', width:50, hidden:'true'},
                	{name:'hidden2', width:50, hidden:'true'},
                	{name:'hidden3', width:50, hidden:'true'},
                	{name:'hidden4', width:50, hidden:'true'},
                	{name:'hidden5', width:50, hidden:'true'},
                	{name:'hidden6', width:50, hidden:'true'},
                	{name:'hidden7', width:50, hidden:'true'},
                	{name:'hidden8', width:50, hidden:'true'},
                	{name:'hidden9', width:50, hidden:'true'},
                	{name:'hidden10', width:50, hidden:'true'},
                	{name:'hidden11', width:50, hidden:'true'},
                	{name:'hidden12', width:50, hidden:'true'},
                	{name:'hidden13', width:50, hidden:'true'},
                	{name:'hidden14', width:50, hidden:'true'},
                	{name:'hidden15', width:50, hidden:'true'},
                	{name:'hidden16', width:50, hidden:'true'},
                	{name:'hidden17', width:50, hidden:'true'},
                	{name:'hidden18', width:50, hidden:'true'},
                	{name:'hidden19', width:50, hidden:'true'},
                	{name:'hidden20', width:50, hidden:'true'}
                ],

                multiselect: true,
                loadtext : "데이타를 가져오고 있는 중 ~~",
                
                //ondblClickRow : function(rowId, iRow, iCol, e){ alert(rowId+","+iRow+","+iCol); },              
                ondblClickRow : function(cellValue,rowObject,options) { alert(cellValue+"/"+rowObject); },

                caption: "Manipulating Array Data"

            });

            // 로컬 데이터
            myData = [

             <% for(int i=0; i<=10000; i++){ %>
             
             
                {id:"<%=i%>",ords_mk_dati:"2007-10-01",ords_kn:"주문요청",ords_num:"16189438-1(4352067629-60)",cust_nm:"에스케이하이닉스 주식회사 / 테스대영 (에스케이하이닉스 주식회사 / 테스동건)",
                	prd_cd:"BPT6G(F1155412)",plis_nm:"PRESSURE TRANSMITTER",spec:"	1110*1110*100mm/앵글:100mm, SK하이닉스자회사전용",
                	mdl_nm:"MCK03621(CSK)",unit:"EA",cnt:"500",comp:"500",unit:"EA",cnt:"5000",upri:"246520",pri:"246520",proc_nm:"수주접수",
                	hidden1:"16189438-1(4352067629-60)",hidden2:"16189438-1(4352067629-60)",hidden3:"16189438-1(4352067629-60)",hidden4:"16189438-1(4352067629-60)",hidden5:"16189438-1(4352067629-60)",
                	hidden6:"16189438-1(4352067629-60)",hidden7:"16189438-1(4352067629-60)",hidden8:"16189438-1(4352067629-60)",hidden9:"16189438-1(4352067629-60)",hidden10:"16189438-1(4352067629-60)",
                	hidden11:"16189438-1(4352067629-60)",hidden12:"16189438-1(4352067629-60)",hidden13:"16189438-1(4352067629-60)",hidden14:"16189438-1(4352067629-60)",hidden15:"16189438-1(4352067629-60)",
                	hidden16:"16189438-1(4352067629-60)",hidden17:"16189438-1(4352067629-60)",hidden18:"16189438-1(4352067629-60)",hidden19:"16189438-1(4352067629-60)",hidden20:"16189438-1(4352067629-60)"
                	},                
                        
            <% }%>
	            {id:"End",ords_mk_dati:"2007-10-01",ords_kn:"주문요청",ords_num:"16189438-1(4352067629-60)",cust_nm:"에스케이하이닉스 주식회사 / 테스대영 (에스케이하이닉스 주식회사 / 테스동건)",
	            	prd_cd:"BPT6G(F1155412)",plis_nm:"PRESSURE TRANSMITTER",spec:"	1110*1110*100mm/앵글:100mm, SK하이닉스자회사전용",
	            	mdl_nm:"MCK03621(CSK)",unit:"EA",cnt:"500",comp:"500",unit:"EA",cnt:"500",upri:"246,520",pri:"246,520",proc_nm:"수주접수",
	            	hidden1:"16189438-1(4352067629-60)",hidden2:"16189438-1(4352067629-60)",hidden3:"16189438-1(4352067629-60)",hidden4:"16189438-1(4352067629-60)",hidden5:"16189438-1(4352067629-60)",
                	hidden6:"16189438-1(4352067629-60)",hidden7:"16189438-1(4352067629-60)",hidden8:"16189438-1(4352067629-60)",hidden9:"16189438-1(4352067629-60)",hidden10:"16189438-1(4352067629-60)",
                	hidden11:"16189438-1(4352067629-60)",hidden12:"16189438-1(4352067629-60)",hidden13:"16189438-1(4352067629-60)",hidden14:"16189438-1(4352067629-60)",hidden15:"16189438-1(4352067629-60)",
                	hidden16:"16189438-1(4352067629-60)",hidden17:"16189438-1(4352067629-60)",hidden18:"16189438-1(4352067629-60)",hidden19:"16189438-1(4352067629-60)",hidden20:"16189438-1(4352067629-60)"
	            	}
	            ];
            // 데이터 추가

            for( i=0, max = myData.length ; i<=max ; i++ ){
                grid.jqGrid('addRowData', i+1, myData[i]);
            }

        });

    </script>

</head>
<body>

<table id="list4"></table>


</body>

</html>