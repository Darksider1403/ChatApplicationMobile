import "./App.css";
import ScrollToTopButton from "./components/OnTop";
import RouterConfig from "./components/router";


function App() {
  return (
    <div className="App">
      <RouterConfig></RouterConfig>
      <ScrollToTopButton />
    </div>
  );
}

export default App;
