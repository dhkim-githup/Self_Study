import logo from './logo.svg';
import './App.css';

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
           props.onChangeMode(event.target.id);
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
  console.log(props);

  return  <article>
            <h2>{props.title}</h2>
              {props.body}
          </article>
}

function App() {
  const topics = [
    {id:1, title:'html', body:'html is'},
    {id:2, title:'css', body:'css is'},
    {id:3, title:'js', body:'Javascript is'},
    ]
  return (
    <div>
      <Header title="ReactTitle" onChangeMode= { ()=>{alert('Hi'); }} ></Header>
      <Nav topics={topics} onChangeMode={(id)=>{
        alert(id);
      }}></Nav>
      <Article title="Article Title" body="Hello Article"></Article> 
      <Article title="Title" body="Hello Article"></Article> 
    </div>
  );
}

export default App;
