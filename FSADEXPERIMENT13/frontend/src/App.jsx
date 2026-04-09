import { useState } from 'react';
import Dashboard from './components/Dashboard';
import LocalUserList from './components/LocalUserList';
import UserList from './components/UserList';
import FakePostList from './components/FakePostList';

const views = {
  dashboard: 'dashboard',
  localUsers: 'localUsers',
  usersAPI: 'usersAPI',
  fakePosts: 'fakePosts',
};

function App() {
  const [view, setView] = useState(views.dashboard);

  return (
    <div className="app-shell">
      <header>
        <h1>FSAD Experiment 11</h1>
        <p>React API Integration: Local JSON, JSONPlaceholder, and Fake API</p>
      </header>
      <main>
        <Dashboard onNavigate={setView} views={views} />
        <section className="content">
          {view === views.localUsers && <LocalUserList />}
          {view === views.usersAPI && <UserList />}
          {view === views.fakePosts && <FakePostList />}
          {view === views.dashboard && (
            <div className="home-card">
              <h2>Welcome</h2>
              <p>Select one of the options above to load the requested data.</p>
            </div>
          )}
        </section>
      </main>
    </div>
  );
}

export default App;
