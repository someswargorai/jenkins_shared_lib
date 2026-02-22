def call(String project_name){
  sh """
      docker-compose -p ${project_name} down -v --remove-orphans
      docker system prune -af
      docker-compose -p ${project_name} up -d --build
    """
}
