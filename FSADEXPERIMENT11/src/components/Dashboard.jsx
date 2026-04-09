function Dashboard({ onNavigate, views }) {
  return (
    <nav>
      <button type="button" onClick={() => onNavigate(views.localUsers)}>
        Local Users
      </button>
      <button type="button" onClick={() => onNavigate(views.usersAPI)}>
        Users API
      </button>
      <button type="button" onClick={() => onNavigate(views.fakePosts)}>
        Fake API Posts
      </button>
    </nav>
  );
}

export default Dashboard;
