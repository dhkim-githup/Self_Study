<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>

<head lang="en">

    <meta charset="UTF-8">

    <title></title>

    <link rel="stylesheet" type="text/css" media="screen" href="/js/JqGrid/css/jquery-ui-1.11.1.min.css" />
    <link rel="stylesheet" type="text/css" media="screen" href="/js/JqGrid/css/ui.jqgrid.css" />

    <script src="/js/JqGrid/js/jquery-1.11.0.min.js" type="text/javascript"></script>
    <script src="/js/JqGrid/js/jquery-ui-1.11.1.min.js" type="text/javascript"></script>
    <script src="/js/JqGrid/js/i18n/grid.locale-kr.js" type="text/javascript"></script>
    <script src="/js/JqGrid/js/jquery.jqGrid.min.js" type="text/javascript"></script>
    
    <script type="text/javascript" src="/js/getGridData1.js"></script>

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

	    function setGroupCell(cellvalue, options, rowObject){

	    	var str = "";

	    	if(options.colModel.name=="aa"){
	    		if(rowObject.aa == "002"){
	    			str += '<span class="red">' + rowObject.aa + '</span>';
	    		}else if(rowObject.aa == "003"){
	    			str += '<span class="blue">' + rowObject.aa + '</span>';
	    		}else {
	    			str += rowObject.aa;
	    		}
	    		str += "<br/>";
	    		str += "(" + rowObject.aa + ")";
	    		
	    	}else if(options.colModel.name=="bb"){
	    		if(rowObject.bb == "반품"){
	    			str += '<span class="red">' + rowObject.bb + '</span>';
	    		}else {
	    			str += rowObject.bb;
	    		}
	    		str += "<br/>";
	    		str += "(" + rowObject.bb + ")";
	    		
	    	} else if(options.colModel.name=="cc") { // 5. 행복나래주문번호 + 고객발주번호
	    		
	    		str += rowObject.cc;
	    		str += "<br/>";
	    		str += "(" + rowObject.cc + ")";

	    		str = rowObject.cc;		
	    		//str = rowObject.ordsListNumGroup.split("|").join("<br/>");		

	    	}else if(options.colModel.name=="dd"){
	    		str += rowObject.dd;
	    		str += "<br/>";
	    		str += '<span class="gridLink" onClick="callsvrManPopup(\''+rowObject.dd+'\')">(' + rowObject.cc + ')</span>';
	    	}
	    	else if(options.colModel.name=="ee"){

	    		if(rowObject.ee == null){
	    			str += rowObject.cc;
	    		}else if(rowObject.ee == "B") {
	    			str += '<span class="red">' + rowObject.ee + '</span>';
	    			str += "<br/>";
	    			str += '<span class="blue">(' + rowObject.ee + ')</span>';
	    			str += "<br/>";
	    			str += '<span class="red">' + rowObject.ee + '</span>' + '<span class="gridLink" style="color:#034bc2" onClick="callProcCancel(' + rowObject.ordsNum + ', ' + rowObject.listNum + ')">' + "[변경요청취소]" + '</span>'
	    		}else {
	    			str += rowObject.ee;
	    			str += "<br/>";
	    			str += '<span class="blue">(' + rowObject.ee + ')</span>';
	    			str += "<br/>";
	    			str += '<span class="blue">' + rowObject.ee + '</span>';
	    		}

	    	}else if(options.colModel.name=="ff"){
	    		str += rowObject.ff;
	    		str += "<br/>";
	    		str += "(" + rowObject.ff + ")";
	    	}else if(options.colModel.name=="gg"){
	    		str += rowObject.gg;
	    		str += "<br/>";
	    		str += "(" + rowObject.makeCoNm + ")";
	    	}else if(options.colModel.name=="hh"){
	    		str += rowObject.hh;
	    		str += "<br/>";
	    		str += '<span class="gridLink" onClick="callAcepPopup(\''+rowObject.hh+'\')">' + '(' + rowObject.hh + ')' + '</span>';
	    	}else if(options.colModel.name=="ii"){
	    		if(rowObject.hh == "002"){
	    			str += '<span class="red">' + rowObject.ii + '</span>';
	    		}else{
	    			str += rowObject.ii;
	    		}

	    	}

	    	return str;
	    }

	  //<![CDATA[
        $(function(){
            
            // 변수 선언
            var i, max, myData, grid = $("#list4");
            

            var gridData = getGridData(10000);
            //alert(gridData[100].dd);
            // grid 설정

            grid.jqGrid({

                datatype: "local",
                height: 'auto',
                width: 'auto', 
                gridview: true,
                             
                colNames: ['id','aa','bb','cc','dd','ee', 't0','t1',  'ff','gg','hh','ii','jj','kk',  't3','t4',  'll','mm','nn'
			           , 'a0', 'a1', 'a2', 'a3', 'a4', 'a5', 'a6', 'a7', 'a8' , 'a9'
					   , 'b0', 'b1', 'b2', 'b3', 'b4', 'b5', 'b6', 'b7', 'b8' , 'b9'
			],
         colModel: [
				{ name: 'id', width: 65, sorttype:'int' },
				{ name: 'aa', width: 65,  align:"center" , formatter:setGroupCell},
				{ name: 'bb', width: 65,  align:"center" , formatter:setGroupCell},
				{ name: 'cc', width: 65,  align:"center" , formatter:setGroupCell},
				{ name: 'dd', width: 65,  align:"center" , formatter:setGroupCell},
				{ name: 'ee', width: 65,  align:"center" , formatter:setGroupCell},
				
				{ name: 't0', width: 65,  align:"center" , formatter:setGroupCell},
				{ name: 't1', width: 65,  align:"center" , formatter:setGroupCell},
				
				{ name: 'ff', width: 65,  align:"center" , formatter:setGroupCell},
				{ name: 'gg', width: 65,  align:"center" , formatter:setGroupCell},
				{ name: 'hh', width: 65,  align:"center" , formatter:setGroupCell},
				{ name: 'ii', width: 165, align:"center" , formatter:setGroupCell},
				{ name: 'jj', width: 65,  align:"center" , formatter:setGroupCell},
				{ name: 'kk', width: 65,  align:"center" },
				
				{ name: 't2', width: 65,  align:"center" },
				{ name: 't3', width: 65, align:"center" },
				
				{ name: 'll', width: 65,  align:"center" },
				{ name: 'mm', width: 265, align:"center" },
				{ name: 'nn', width: 265, align:"center" },
				
				{ name:"a0",  align:"center", hidden:true }, //HIDDEN
				{ name:"a1",  align:"center", hidden:true }, //HIDDEN
				{ name:"a2",  align:"center", hidden:true }, //HIDDEN
				{ name:"a3",  align:"center", hidden:true }, //HIDDEN
				{ name:"a4",  align:"center", hidden:true }, //HIDDEN
				{ name:"a5",  align:"center", hidden:true }, //HIDDEN
				{ name:"a6",  align:"center", hidden:true }, //HIDDEN
				{ name:"a7",  align:"center", hidden:true }, //HIDDEN
				{ name:"a8",  align:"center", hidden:true }, //HIDDEN
				{ name:"a9",  align:"center", hidden:true }, //HIDDEN
				
				{ name:"b0",  align:"center", hidden:true }, //HIDDEN
				{ name:"b1",  align:"center", hidden:true }, //HIDDEN
				{ name:"b2",  align:"center", hidden:true }, //HIDDEN
				{ name:"b3",  align:"center", hidden:true }, //HIDDEN
				{ name:"b4",  align:"center", hidden:true }, //HIDDEN
				{ name:"b5",  align:"center", hidden:true }, //HIDDEN
				{ name:"b6",  align:"center", hidden:true }, //HIDDEN
				{ name:"b7",  align:"center", hidden:true }, //HIDDEN
				{ name:"b8",  align:"center", hidden:true }, //HIDDEN
				{ name:"b9",  align:"center", hidden:true } //HIDDEN
                ],
                
                multiselect: true,


                
                sortname: 'id',
                viewrecords: true,
                sortorder: "asc",
                hoverrows: false,

                
				height: 800,						// 그리드 높이 설정
				// autowidth: true,					// 그리드 넓이 자동
				// --> 마우스 스크롤에 영향이 엄청 큼 
				
				multiselect: true,					// 체크박스 생성
				multiselectWidth: 30,
				
                
				cellEdit:true,						// cell edit 여부 설정

				
				// rownumbers: true,					// 각 row의 맨 앞줄에 각 행의 번호가 자동으로 부여 되도록 설정
				//  -> 화면 출력 시간에 부하가 큼  20ch
				
				rownumWidth: 40,

				
				height: "auto",
				width:"auto",
				
                
                loadtext : "데이타를 가져오고 있는 중 ~~",

                caption: "Manipulating Array Data"

            });

            
            for( i=0, max = gridData.length ; i<=max ; i++ ){
                grid.jqGrid('addRowData', i+1, gridData[i]);
            }

        });

    </script>

</head>
<body>

<div style="border: 1px solid #48BAE4; overflow:scroll; height: 800px; width: 1500px;">
	<table id="list4" ></table>
</div>


<p></p>
    <table id="testGrid"><tr><td/></tr></table>
    <div id="pager"></div>

</body>

</html>