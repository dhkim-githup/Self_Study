
function getGridData(n) {
    var data = [];
    for (var i=0;i<n;i++) {
        var num = i.toString();
        data.push(
		
				{id:i, aa:"주문"+num,bb:"일반(X/D)"+num,cc:"15743146-1(SK4400003925-00010)"+num, 
			       dd:"2020-12-21(테스재현)"+num,
				   ee:"2020-05-30"+num,
				   ff:"AMPJJ(-)"+num,
				   gg:"점보롤화장지"+num,
                   hh:"W95mm*L500M, 1겹, 롤, 16ROL/1BOX"+num,
				   ii:"DBJ-104((주)동방제지)"+num,
				   jj:"BOX"+num,
				   kk:"10"+num,
				   ll:"150"+num,
				   mm:"행복나래 주식회사 / 행복나래 주식회사 / 물류팀 / 테스전물류센터(행복나래 주식회사 / 행복나래 주식회사 / 물류팀 / 테스전물류센터)"+num,
				   nn:"168-84 경기도 용인시 처인구 모현읍 자작나무로 3 (죽전물류센터 지하 2층)"+num
				   
				   }
				   
				);
    }
	
	console.log(data);
    return data;
}