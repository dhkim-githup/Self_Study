<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>

<head lang="en">

    <meta charset="UTF-8">

    <title></title>

    <link rel="stylesheet" type="text/css" media="screen" href="../js/JqGrid/css/jquery-ui-1.11.1.min.css" />
    <link rel="stylesheet" type="text/css" media="screen" href="../js/JqGrid/css/ui.jqgrid.css" />

    <script src="../js/JqGrid/js/jquery-1.11.0.min.js" type="text/javascript"></script>
    <script src="../js/JqGrid/js/jquery-ui-1.11.1.min.js" type="text/javascript"></script>
    <script src="../js/JqGrid/js/i18n/grid.locale-kr.js" type="text/javascript"></script>
    <script src="../js/JqGrid/js/jquery.jqGrid.min.js" type="text/javascript"></script>

    <script type="text/javascript">

    	

    
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
                	{name:'id',index:'id', width:60, sorttype:"int"},
                	{name:'ords_mk_dati',index:'ords_mk_dati', width:100},
                	{name:'ords_kn',index:'ords_kn', width:100},
                	{name:'ords_num',index:'ords_num', width:100},
                	{name:'cust_nm',index:'cust_nm', width:200},
                	{name:'prd_cd',index:'prd_cd', width:100},
                	{name:'plis_nm',index:'plis_nm', width:200},
                	{name:'spec',index:'spec', width:200},
                	{name:'mdl_nm',index:'mdl_nm', width:100},
                	{name:'unit',index:'unit', width:30},
                	{name:'cnt',index:'cnt', width:30},
                	{name:'comp',index:'comp', width:30},                	
                	{name:'upri',index:'upri', width:30},
                	{name:'pri',index:'pri', width:30},
                	{name:'proc_nm',index:'proc_nm', width:50},
                	{name:'hidden1',index:'hidden1', width:50, hidden:'true'},
                	{name:'hidden2',index:'hidden2', width:50, hidden:'true'},
                	{name:'hidden3',index:'hidden3', width:50, hidden:'true'},
                	{name:'hidden4',index:'hidden4', width:50, hidden:'true'},
                	{name:'hidden5',index:'hidden5', width:50, hidden:'true'},
                	{name:'hidden6',index:'hidden6', width:50, hidden:'true'},
                	{name:'hidden7',index:'hidden7', width:50, hidden:'true'},
                	{name:'hidden8',index:'hidden8', width:50, hidden:'true'},
                	{name:'hidden9',index:'hidden9', width:50, hidden:'true'},
                	{name:'hidden10',index:'hidden10', width:50, hidden:'true'},
                	{name:'hidden11',index:'hidden11', width:50, hidden:'true'},
                	{name:'hidden12',index:'hidden12', width:50, hidden:'true'},
                	{name:'hidden13',index:'hidden13', width:50, hidden:'true'},
                	{name:'hidden14',index:'hidden14', width:50, hidden:'true'},
                	{name:'hidden15',index:'hidden15', width:50, hidden:'true'},
                	{name:'hidden16',index:'hidden16', width:50, hidden:'true'},
                	{name:'hidden17',index:'hidden17', width:50, hidden:'true'},
                	{name:'hidden18',index:'hidden18', width:50, hidden:'true'},
                	{name:'hidden19',index:'hidden19', width:50, hidden:'true'},
                	{name:'hidden20',index:'hidden20', width:50, hidden:'true'}
                ],

                multiselect: true,
                loadtext : "데이타를 가져오고 있는 중 ~~",
                
                ondblClickRow : function(rowId, iRow, iCol, e){
                    	alert(rowId+","+iRow+","+iCol);
                    },              

                caption: "Manipulating Array Data"

            });

            // 로컬 데이터
            myData = [

             <% for(int i=0; i<=1000; i++){ %>
             
             
                {id:"<%=i%>",ords_mk_dati:"2007-10-01",ords_kn:"주문요청",ords_num:"16189438-1(4352067629-60)",cust_nm:"에스케이하이닉스 주식회사 / 테스대영 (에스케이하이닉스 주식회사 / 테스동건)",
                	prd_cd:"BPT6G(F1155412)",plis_nm:"PRESSURE TRANSMITTER",spec:"	1110*1110*100mm/앵글:100mm, SK하이닉스자회사전용",
                	mdl_nm:"MCK03621(CSK)",unit:"EA",cnt:"500",comp:"500",unit:"EA",cnt:"500",upri:"246,520",pri:"246,520",proc_nm:"수주접수",
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