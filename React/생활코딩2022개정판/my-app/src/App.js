import logo from './logo.svg';
import './App.css';
import { useState } from 'react';

function Header(props){
  
  return <header>
         <h1><a href="/" onClick={ (event) => {
          event.preventDefault();          
          props.onChangeMode();
         }}>{props.title}</a></h1>   
         </header>   

}

function Nav(props){
  const list= [];
  for(let i=0; i<props.topics.length; i++){
    let t=props.topics[i];
    list.push(<li key={t.id}>
        <a id={t.id} href={'/read/'+t.id} onClick={(event)=>{
           event.preventDefault();
           props.onChangeMode(Number(event.target.id));
        }}>{t.title}</a>
        </li>);
  }
  return <nav>
          <ol>
            {list}
          </ol> 
          </nav>
}

function Article(props){
  //console.log(props);

  return  <article>
            <h2>{props.title}</h2>
              {props.body}
          </article>
}

function App() {
  // const _mode = useState('Welcome');
  // const mode = _mode[0];
  // const setMode = _mode[1];
  const [mode, setMode] = useState('Welcome');
  const [id, setId] = useState(null);
  const topics = [
    {id:1, title:'html', body:'html is'},
    {id:2, title:'css', body:'css is'},
    {id:3, title:'JavaScript', body:'Javascript is'},
    ]

    let content = null;
    if(mode === 'Welcome'){
      content = <Article title="welcome Title" body="Hello Web"></Article>
    }else if(mode ==='Read'){

      let title, body =null;
    for(let i=0; i<topics.length; i++){
      console.log('Here=>'+topics[i].id);
      console.log('Here=>'+id);
      if(topics[i].id === id){
          title = topics[i].title;
          body  = topics[i].body;
          console.log('title=>'+title);
      }
    }

      content = <Article title={title} body={body}></Article>
    }

  return (
    <div>
      <Header title="ReactTitle" onChangeMode= { 
        ()=>{ setMode('Welcome'); }} ></Header>
      <Nav topics={topics} onChangeMode={
        (_id)=>{   setMode('Read'); 
                   setId(_id);
        }} >
                
        </Nav>
      {content}
    </div>
  );
}

export default App;
